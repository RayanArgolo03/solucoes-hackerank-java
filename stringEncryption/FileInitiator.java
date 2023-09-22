package stringEncryption;

import controllers.ClientController;
import controllers.ExcelController;
import controllers.FolderController;
import controllers.LogController;
import domain.client.Client;
import domain.log.Log;
import enums.LogType;

import java.util.Set;

public class FileInitiator {
    public static void runProgram(ClientController clientController, FolderController folderController, LogController logController, ExcelController excelController) {

        try {
            //Seta pasta de retorno dos arquivos gerados pelo sistema
            folderController.setFolder();

            excelController.setExcelDataBase(folderController.getFolder().getPath());
            logController.setLogFile(folderController.getFolder().getPath());

            //Caso já exista pasta: gera log de pasta antiga e verifica se quer db antigo
            if (folderController.isOldFolder()) {
                excelController.getExcelService().getDataBase(excelController.getExcelDataBase());

                //Escolhe excel -> usa log antigo ou cria novo conforme a escolha
                if (excelController.getExcelService().isOldDatabase()) {

                    //Caso arquivo log tenha sido apagado
                    if (logController.isOldLogFile()) {
                        logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.PEGOU, " log do programa anterior"));
                    } else {
                        logController.getLogService().createFile(folderController.getFolder().getPath() + "\\logs.txt");
                        logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.CRIOU, " novo arquivo LOG"));

                        Set<Client> oldClientes = excelController.getExcelService().getClients(excelController.getExcelDataBase());

                        //Grava clientes antigos no LOG
                        logController.getLogService()
                                .insertRegister(logController.getLogFile(),
                                        new Log(LogType.PEGOU, " clientes do EXCEL database antigo"), oldClientes);
                    }
                } else {
                    logController.getLogService().delete(logController.getLogFile());
                    logController.getLogService().createFile(logController.getLogFile().getPath());
                    logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.CRIOU, " novo EXCEL database"));
                    logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.CRIOU, " novo arquivo LOG"));
                }
            } else {

                //Cria pasta -> Cria arquivo de Log e formata -> Insere novos logs
                folderController.getFolderService().createFile(folderController.getFolder().getPath());

                logController.getLogService().createFile(logController.getLogFile().getPath());
                logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.CRIOU, " nova pasta"));
                logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.CRIOU, " novo arquivo LOG"));

                excelController.getExcelService().createFile(excelController.getExcelDataBase().getPath());
                logController.getLogService().insertRegister(logController.getLogFile(), new Log(LogType.CRIOU, " novo EXCEL database"));

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! Tipo de dado inválido " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

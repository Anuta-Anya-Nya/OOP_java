package terminal;

public class MessageLogExecutable implements MessageLog{
    private static final String SUCCESS_MES = "Команда успешно выполнена!";
    private static final String FAILED_MES = "Команда не выполнена!";

    @Override
    public void successfulAction() {
        System.out.println(SUCCESS_MES);
    }

    @Override
    public void failedAction() {
        System.out.println(FAILED_MES);
    }
    
}

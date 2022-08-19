package work.space.entity;

public class ResultObject {

    private Boolean isOK;
    private String message;
    private Object data;


    public ResultObject(){

    }
    public ResultObject(Boolean isOK){
        this.isOK = isOK;
        this.message = message;
    }

    public ResultObject(Boolean isOK, String message){
        this.isOK = isOK;
        this.message = message;
    }

    public ResultObject(Boolean isOK, String message, Object data){
        this.isOK = isOK;
        this.message = message;
        this.data = data;
    }

    public Boolean getIsOK() {
        return isOK;
    }

    public void setOK(Boolean isOK) {
        this.isOK = isOK;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "ResultObject{" +
                "isOK=" + isOK +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

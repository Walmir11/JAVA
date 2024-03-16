package Lista3.Q4;

import java.time.LocalDateTime;

public class MainQ4 {
    public static void main(String[] args) {
        Msg msg;

        if((LocalDateTime.now().getMinute()%2)==0){
            msg = new MsgPos();
            System.out.println(msg.mensagem());
        }else {
            msg = new MgsNeg();
            System.out.println(msg.mensagem());
        }

    }
}

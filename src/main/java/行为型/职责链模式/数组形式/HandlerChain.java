package 行为型.职责链模式.数组形式;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler){
        this.handlers.add(handler);
    }

    public void handle(){
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if(handled){
                break;
            }
        }
    }

}

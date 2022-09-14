package tocountdigitsinaninteger.exception;

import com.sun.xml.internal.ws.api.message.Message;

public class NumberException extends NumberFormatException{
    public NumberException(String msg)
    {
        super(msg);
    }
}

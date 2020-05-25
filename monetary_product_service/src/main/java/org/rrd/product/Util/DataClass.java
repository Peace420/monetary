package org.rrd.product.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataClass {
    /**
     *  hujie
     * @return
     * @throws ParseException
     */
    public static Date time() throws ParseException {


    Date date = new Date();
    SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
    String format = dateFormat.format(date);
    Date datetime = dateFormat.parse(format);
    return datetime;
    }
}

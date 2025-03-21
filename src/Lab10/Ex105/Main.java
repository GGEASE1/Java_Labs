package Lab10.Ex105;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class Main
{

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException
    {
        String filepath = "src/Lab10/Ex105/Table.xlsx";
        logger.info("Чтение таблицы");
        GoodsCartXLSX cart = new GoodsCartXLSX(filepath);
        cart.print_goods();
    }
}

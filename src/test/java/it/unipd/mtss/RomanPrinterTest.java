package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintI() { //verifico la stampa del numero 1
        String expected = 
            "  _____  \n" +
            " |_   _| \n" +
            "   | |   \n" +
            "   | |   \n" +
            "  _| |_  \n" +
            " |_____| \n";
            
            assertEquals(expected, RomanPrinter.print(1));
        }
        
    @Test
    public void testPrintIII() { //verifico la stampa del numero 3
        String expected = 
            "  _____     _____     _____  \n" +
            " |_   _|   |_   _|   |_   _| \n" +
            "   | |       | |       | |   \n" +
            "   | |       | |       | |   \n" +
            "  _| |_     _| |_     _| |_  \n" +
            " |_____|   |_____|   |_____| \n";
                
        assertEquals(expected, RomanPrinter.print(3));
    }

    @Test
    public void testPrintIV() { //verifico la stampa del numero 4
        String expected = 
            "  _____    __      __ \n" +
            " |_   _|   \\ \\    / / \n" +
            "   | |      \\ \\  / /  \n" +
            "   | |       \\ \\/ /   \n" +
            "  _| |_       \\  /    \n" +
            " |_____|       \\/     \n";
            
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    public void testPrintV() { //verifico la stampa del numero 5
        String expected = 
            " __      __ \n" +
            " \\ \\    / / \n" +
            "  \\ \\  / /  \n" +
            "   \\ \\/ /   \n" +
            "    \\  /    \n" +
            "     \\/     \n";
        
        assertEquals(expected, RomanPrinter.print(5));
    }

    @Test
    public void testPrintIX() { //verifico la stampa del numero 9
        String expected = 
            "  _____    __    __ \n" +
            " |_   _|   \\ \\  / / \n" +
            "   | |      \\ \\/ /  \n" +
            "   | |       >  <   \n" +
            "  _| |_     / /\\ \\  \n" +
            " |_____|   /_/  \\_\\ \n";
            
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    public void testPrintX() { //verifico la stampa del numero 10
        String expected = 
            " __    __ \n" +
            " \\ \\  / / \n" +
            "  \\ \\/ /  \n" +
            "   >  <   \n" +
            "  / /\\ \\  \n" +
            " /_/  \\_\\ \n";
            
        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    public void testPrintL() {  //verifica la stampa del numero 50
        String expected = 
            "  _       \n" +
            " | |      \n" +
            " | |      \n" +
            " | |      \n" +
            " | |____  \n" +
            " |______| \n";
        
        assertEquals(expected, RomanPrinter.print(50));
    }

    @Test
    public void testPrintC() { //verifica la stampa del numero 100
        String expected = 
            "  _____  \n" +
            " / ____| \n" +
            "| |      \n" +
            "| |      \n" +
            "| |____  \n" +
            " \\_____| \n";
        
        assertEquals(expected, RomanPrinter.print(100));
    }

    @Test
    public void testPrintXL() {
        // Test per il numero 40
        String expected = 
            " __    __    _       \n" +
            " \\ \\  / /   | |      \n" +
            "  \\ \\/ /    | |      \n" +
            "   >  <     | |      \n" +
            "  / /\\ \\    | |____  \n" +
            " /_/  \\_\\   |______| \n";
            
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    public void testPrintXC() {
        // Test per il numero 90
        String expected = 
            " __    __    _____  \n" +
            " \\ \\  / /   / ____| \n" +
            "  \\ \\/ /   | |      \n" +
            "   >  <    | |      \n" +
            "  / /\\ \\   | |____  \n" +
            " /_/  \\_\\   \\_____| \n";
            
        assertEquals(expected, RomanPrinter.print(90));
    }

    @Test
    public void testPrintLXXXVIII() {  //verifico la stampa del numero 88 (concatenazione dei simboli)
        String expected = 
            "  _         __    __   __    __   __    __   __      __    _____     _____     _____  \n" +
            " | |        \\ \\  / /   \\ \\  / /   \\ \\  / /   \\ \\    / /   |_   _|   |_   _|   |_   _| \n" +
            " | |         \\ \\/ /     \\ \\/ /     \\ \\/ /     \\ \\  / /      | |       | |       | |   \n" +
            " | |          >  <       >  <       >  <       \\ \\/ /       | |       | |       | |   \n" +
            " | |____     / /\\ \\     / /\\ \\     / /\\ \\       \\  /       _| |_     _| |_     _| |_  \n" +
            " |______|   /_/  \\_\\   /_/  \\_\\   /_/  \\_\\       \\/       |_____|   |_____|   |_____| \n";
        
        assertEquals(expected, RomanPrinter.print(88));
    }
    
    @Test
    public void testPrintXCIX() {  //verifico la stampa del numero 99
        String expected = 
            " __    __    _____     _____    __    __ \n" +
            " \\ \\  / /   / ____|   |_   _|   \\ \\  / / \n" +
            "  \\ \\/ /   | |          | |      \\ \\/ /  \n" +
            "   >  <    | |          | |       >  <   \n" +
            "  / /\\ \\   | |____     _| |_     / /\\ \\  \n" +
            " /_/  \\_\\   \\_____|   |_____|   /_/  \\_\\ \n";
        
        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test(expected = IllegalArgumentException.class) //gestisco il caso in cui la conversione non avvenga correttamente
        public void testPrintNull() {
            RomanPrinter.print(-1); 
        }

}
try {
 int d = 0;
 if (d != 0 && intArray.length > 8) {  // проверка деления на ноль и выхода за границы массива
 double catchedRes1 = intArray[8] / d;
 System.out.println("catchedRes1 = " + catchedRes1);
 }
 } catch (ArithmeticException e) {
 System.out.println("Catching exception: " + e);
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Catching array index out of bounds: " + e);
}

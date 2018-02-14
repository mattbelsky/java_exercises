package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        // Countries beginning with "A" sorted into a nested array by region
        String[][] countries = {
                {"Afghanistan", "Armenia", "Azerbaijan"},
                {"Albania", "Andorra", "Austria"},
                {"Algeria", "Angola"},
                {"American Samoa", "Australia"},
                {"Anguilla", "Antigua & Barbuda", "Aruba"},
                {"Antarctica"}
        };

        for (String country[] : countries) {
            for (String c : country) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}


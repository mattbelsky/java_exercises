package objects_classes_methods.labs;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */
class fullMoonDemo {
    public static void main(String[] args) {
        int dateCode = 723489;
        String dateString = "7/22";
        int month = 7;
        int day = 22;

        fullMoon try1 = new fullMoon();
        fullMoon try2 = new fullMoon();
        fullMoon try3 = new fullMoon();

        System.out.println("A full moon will occur on\n");
        System.out.println(try1.date(dateCode));
        System.out.println(try2.date(dateString));
        System.out.println(try3.date(month, day));
    }
}

class fullMoon {
    double date(double dateCode) {
        return dateCode;
    }

    String date(String dateString) {
        return dateString;
    }

    String date(int m, int d) {
        return m + "/" + d;
    }
}


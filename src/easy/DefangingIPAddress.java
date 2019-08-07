package easy;

public class DefangingIPAddress {

// #1108	Defanging an IP Address

    // Input: "1.1.1.1"
    // Output: "1[.]1[.]1[.]1"

    public static void main(String[] args) {

        String input = "255.2.142.2";
        System.out.println(new DefangingIPAddress().defangIPaddr(input));

    }

    public String defangIPaddr(String address) {

        StringBuilder result = new StringBuilder();

        for (Character c : address.toCharArray()) {

            if(c.equals('.')) {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

}

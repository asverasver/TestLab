package utilities;

// Java code to illustrate how to reverse an array without affecting special characters.
// Taken from: https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/

public class GFG
{
    public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0; // 1

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r) // 2
        {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l])) // 3
                l++; //4
            else if(!Character.isAlphabetic(str[r])) // 5
                r--; // 6
            // Both str[l] and str[r] are not spacial
            else
            {
                char tmp = str[l]; // 7
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}

// This code is contributed by panwarabhishek345

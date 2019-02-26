package utilities;

// Java code to illustrate how to reverse an array without affecting special characters.
// Taken from: https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/

public class GFG
{
    public static void reverse(char str[])
    {
        // Initialize left and right pointers
        int r = str.length - 1, l = 0;

        // Traverse string from both ends until
        // 'l' and 'r'
        while (l < r)
        {
            // Ignore special characters
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if(!Character.isAlphabetic(str[r]))
                r--;

            // Both str[l] and str[r] are not spacial
            else
            {
                char tmp = str[l];
                str[l] = str[r];
                str[r] = tmp;
                l++;
                r--;
            }
        }
    }
}

// This code is contributed by panwarabhishek345

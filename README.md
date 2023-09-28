# Encryption-Decryption
#### A simple java program to encrypt and decrypt text input, based on the encryption key given. 
There are two encryption/decrytpion algorithms available:

1. **Shift** -> it shifts each letter by the specified number (the key) according to its order in the alphabet in circle;
2. **Unicode** -> performs encryption/decryption based on the Unicode table.

The app is controlled from the terminal.

Here's the link to the project: https://hyperskill.org/projects/46?track=1

**Commands:**
- "**-mode**" -> accepts 2 possible strings: "**enc**" (encryption) or "**dec**" (decryption);
- "**-key**" -> accepts integers as the key of encryption/decryption;
- "**-data**" -> accepts a strings as the input text to encrypt/decrypt;
- "**-in**" -> accepts a string as the name of the source .txt file to read the data to encrypt/decrypt from;
- "**-out**" -> accepts a string as the name of the output .txt file to write the result of encryption/decryption to;
- "**-alg**" -> accepts 2 possible strings: "**shift**" (using shifting algorithm to encrypt/decrypt) or "**unicode**" (using unicode algorithm to encrypt/decrypt).

**Additional rules:**
1. If there is no -mode, the program should work in enc mode.
2. If there is no -key, the program will consider that key = 0.
3. The program will read data from -data or from a file written in the -in argument. That's why you can't have both -data and -in arguments simultaneously, only one of them.
4. If there is no -data and there is no -in the program will assume that the data is an empty string.
5. If there is no -out argument, the program will print data to the standard output.
6. If there are both -data and -in arguments, the program will prefer -data over -in.
7. If there is no -alg the program will default to shift.
8. Remember that in case of shift algorithm you need to encode only English letters (from 'a' to 'z' as the first circle and from 'A' to 'Z' as the second circle i.e. after 'z' comes 'a' and after 'Z" comes 'A').
9. The arguments may be in different order.
10. If there is a non-standard situation (an input file does not exist or an argument doesn’t have a value), the program will display a clear message about the problem.

## Usage
**Example 1**

**Input:**  
CLI Arguments: -mode enc -key 7 -data "Welcome to Encryption-Decryption" -alg unicode
  
**Output:**  
^lsjvtl'{v'Lujy w{pvu4Kljy w{pvu

**Example 2**

**Input:**  
CLI Arguments: -mode enc -in road_to_treasure.txt -out protected.txt -key 7 -alg unicode

This command gets data from the file road_to_treasure.txt, encrypt the data with the key 5, create a file called protected.txt and write ciphertext to it.

**Output:**  
The input to encrypt is: "I hope you enjoy learning java"  
The result is: )P'ovwl' v|'luqv 'slhyupun'qh}h)

**Example 3**

**Input:**  
CLI Arguments: -key 5 -alg shift -data "Bjqhtrj yt jshwduynts-ijhwduynts" -mode dec

**Output:**  
Welcome to encryption-decryption

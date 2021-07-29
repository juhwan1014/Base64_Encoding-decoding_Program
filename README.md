# Base64_Encoding-decoding_Program

## 1. Project Introduction<br />
The program I implemented is a program that decodes 64Base characters into ASKII characters, and in contrast encodes ASKII characters into 64Base characters. It is a program that receives input to initially encode or decode and executes a program that meets its purpose, followed by a string to encode or decode.<br /><br />

## 2. What is Base64? 

Base 64 (Base Sixty) is a concept that converts 8-bit binary data (e.g., executables, ZIP files, etc.) into a series of strings consisting only of characters in a common ASCII domain that are not affected by character code.<br />
Originally, a literal translation of Base 64 means 64 digits. What is particularly interesting about 64 in computers is that 64 is the number of squares of 2 (64 = 26) and is the largest representation of the ASCII characters displayed on the screen among the equations based on the number of squares of 2. The next square number, 128 digits, requires 128 symbols, but not 128 ASCII characters on the screen.<br />
For this reason, this encoding is often used for binary data transmission through e-mail. Base 64 has many variations depending on which characters and symbols are written, but what is well known is that the first 62 use the letters A-Z, a-z, and 0-9 and only the difference between the last two.<br /><br />


## 3. Personal Feeling

Before making the program, I set up simple logic, thought about what to do first, and realized the importance of the idea of realizing it once again. Although it was difficult to actually encode and decode 64base, I felt a sense of pleasure and fun when I succeeded in studying and applying bit operations and implementing them.<br />
At first, it did not think of designating an encoder and decode as functions. Without thinking about efficiency, I wrote the code with the main function alone with the if-else statement. However, looking at the completed code, I felt the need to specify a function separately, and I could think about the exception handling of input during the process. I learned that it is important to simply write code, so I gained confidence that I will be able to improve my program skills using this as a stepping stone.<br />
The most difficult thing during the assignment was that I had no knowledge of bit operations and had to study again from the beginning. I had no idea about what methods are proper to use and how much should I do for bit shifting. However, I thought about what I should do first and came up with the code by searching for the appropriate methods and operators. I was able to study many methods during this assignment, and I found my errors over and over again. <br />
In conclusion, I learned the importance of coding efficiently and how to find solutions when faced with various errors.

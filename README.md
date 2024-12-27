Password Generator

The Password Generator is a console-based Java application that allows users to create secure and customizable passwords based on their preferences. It demonstrates the use of object-oriented programming concepts, user input handling, and validation logic to ensure generated passwords meet specific requirements.

Features
Customizable Length: Users can specify the desired length of the password.
Character Options:
Lowercase Letters: Include lowercase alphabets (a-z).
Uppercase Letters: Include uppercase alphabets (A-Z).
Numbers: Include numerical digits (0-9).
Symbols: Include special characters (e.g., !@#$%^&*()).
Dynamic Character Pool: The character set is dynamically built based on user preferences.
Validation: Ensures the generated password includes at least one character from each selected type.
Retry Mechanism: Automatically generates a new password if the current one fails validation.
User-Friendly Interface: Guides users through the password creation process with clear prompts.



Password Generator
The Password Generator is a console-based Java application that allows users to create secure and customizable passwords based on their preferences. It demonstrates the use of object-oriented programming concepts, user input handling, and validation logic to ensure generated passwords meet specific requirements.

Features
Customizable Length: Users can specify the desired length of the password.
Character Options:
Lowercase Letters: Include lowercase alphabets (a-z).
Uppercase Letters: Include uppercase alphabets (A-Z).
Numbers: Include numerical digits (0-9).
Symbols: Include special characters (e.g., !@#$%^&*()).
Dynamic Character Pool: The character set is dynamically built based on user preferences.
Validation: Ensures the generated password includes at least one character from each selected type.
Retry Mechanism: Automatically generates a new password if the current one fails validation.
User-Friendly Interface: Guides users through the password creation process with clear prompts.
How It Works
User Interaction:

At the start of the application, users are prompted to specify the password's length and the types of characters to include.
The program asks simple yes/no questions to determine preferences (e.g., "Would you like to include lowercase letters?").
Character Pool Construction:

Based on user input, a dynamic pool of characters is created by combining the selected sets (lowercase, uppercase, numbers, symbols).
Password Generation:

A random password is generated using characters from the pool.
The password length matches the user's specified length.
Validation:

The application checks if the password contains at least one character from each selected type.
If validation fails, a new password is generated automatically.
Display:

Once a valid password is generated, it is displayed to the user.
Replay Option:

Users can choose to generate another password by restarting the process.

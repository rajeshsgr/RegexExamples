Check duplicate words in a sentence

Regex pattern used: \\b(\\w+)(\\s+\\1\\b)*

\\b - word boundary

\\w+ - match word characters with the predefined character class with the code \w which Occurs one or more times

\\s+ - - matches sequence of one or more whitespace characters.

\\1 -   Backreference is a way to repeat a capturing group. \1 matches the exact same text that was matched by the first capturing group.



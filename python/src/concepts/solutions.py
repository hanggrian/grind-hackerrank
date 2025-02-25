from abc import ABC


class Solution(ABC):
    def __init__(self):
        self.prints: list[str] = []

    def println(self, s: str) -> None:
        self.prints.append(s)

    def __str__(self):
        return '\n'.join(self.prints)

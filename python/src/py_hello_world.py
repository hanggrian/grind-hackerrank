from src.concepts.solutions import Solution


class PyHelloWorld(Solution):
    def __init__(self):
        super().__init__()
        self.println('Hello World!')

import unittest

from src.concepts.solutions import Solution


class TestSolution(unittest.TestCase):
    def test(self):
        solution = Solution()
        solution.println('1')
        solution.println('2')
        solution.println('3')
        self.assertEqual(['1', '2', '3'], solution.prints)


if __name__ == '__main__':
    unittest.main()

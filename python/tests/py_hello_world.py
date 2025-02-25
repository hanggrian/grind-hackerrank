import unittest

from python.src.py_hello_world import PyHelloWorld


class TestPyHelloWorld(unittest.TestCase):
    def test(self):
        s = 'Hello World!'
        self.assertEqual([s], PyHelloWorld().prints, s)


if __name__ == '__main__':
    unittest.main()

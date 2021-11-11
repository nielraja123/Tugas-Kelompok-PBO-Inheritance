from Kucing import Kucing
from Badak import Badak
from Gajah import Gajah
from Mamalia import Mamalia
from Makhluk import Makhluk

# Main
if __name__ == "__main__":
    makhluk = Makhluk()
    makhluk.info()

    makhluk = Mamalia()
    makhluk.info()

    makhluk = Kucing()
    makhluk.info()

    makhluk = Badak()
    makhluk.info()

    makhluk = Gajah()
    makhluk.info()

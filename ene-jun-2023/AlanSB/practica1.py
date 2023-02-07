class Suma_Numeros:

    def suma(self, numero1, numero2):
        resultado = numero1 +  numero2
        print("La suma es: "+ str(resultado))


sumador = Suma_Numeros()
n1 = input("¿Dime el primer número?")
n2 = input("¿Dime el segundo número?")

sumador.suma(n1,n2)
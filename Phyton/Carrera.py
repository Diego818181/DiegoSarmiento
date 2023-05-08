class Carrera:
    def __init__(self, nombre, duracion):
        self.nombre = nombre
        self.duracion = duracion
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_duracion(self):
        return self.duracion
    
    def set_duracion(self, duracion):
        self.duracion = duracion
    
    def imprimir_datos(self):
        print("Nombre de la carrera: " + self.nombre)
        print("Duración de la carrera: " + str(self.duracion) + " años")
class Universidad:
    def __init__(self, nombre, carreras):
        self.nombre = nombre
        self.carreras = carreras
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_carreras(self):
        return self.carreras
    
    def set_carreras(self, carreras):
        self.carreras = carreras
    
    def imprimir_carreras(self):
        print("Carreras de la Universidad " + self.nombre + ":")
        for carrera in self.carreras:
            print("- " + carrera.get_nombre())
class StockRecord:
    def __init__(self, species, quantity, best_before):
        self.species = species  # object of FlowerSpecies class
        self.quantity = quantity
        self.best_before = best_before

    def sow_seeds(self, seeds_sown):
        self.quantity -= seeds_sown

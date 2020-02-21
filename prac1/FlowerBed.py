class FlowerBed:
    def __init__(self, size, bed_id, area_in_use):
        self.size = size  # in square metres
        self.bed_id = bed_id
        self.area_in_use = area_in_use # in square metres

    def change_area_in_use_by(self, area_changed):
        " adds area planted or removes area unplanted "
        self.area_in_use += area_changed

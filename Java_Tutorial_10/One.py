from pyDatalog import pyDatalog

# Initialize PyDatalog
pyDatalog.clear()

# Define terms for the program
pyDatalog.create_terms('Item, Quantity, Price, StockLevel, ReorderPoint, InventoryValue, Sale, Restock, total_inventory_value, TotalValue, Value')

# Represent inventory items and their details
# (Item, Quantity, Price, ReorderPoint)
+ Item('apple', 100, 0.5, 20)
+ Item('banana', 150, 0.3, 30)
+ Item('orange', 80, 0.6, 15)

# Calculate stock level from quantity
StockLevel(Item, Quantity) <= Item(Item, Quantity, Price, ReorderPoint)

# Calculate total inventory value for an item
InventoryValue(Item, TotalValue) <= Item(Item, Quantity, Price, ReorderPoint) & (TotalValue == Quantity * Price)

# Calculate total inventory value across all items
total_inventory_value(TotalValue) <= (InventoryValue(Item, Value) & (TotalValue == sum_(Value)))

# Simulate a sale transaction
Sale(Item, SoldQty) <= (Item(Item, Quantity, Price, ReorderPoint) & (Quantity >= SoldQty))
(Item(Item, NewQuantity, Price, ReorderPoint)) <= (Sale(Item, SoldQty) & Item(Item, Quantity, Price, ReorderPoint) & (NewQuantity == Quantity - SoldQty))

# Simulate restocking
Restock(Item, RestockedQty) <= (Item(Item, Quantity, Price, ReorderPoint))
(Item(Item, NewQuantity, Price, ReorderPoint)) <= (Restock(Item, RestockedQty) & Item(Item, Quantity, Price, ReorderPoint) & (NewQuantity == Quantity + RestockedQty))

# Function to check stock levels and if reorder is needed
def check_reorder_point():
    items_to_reorder = []
    for item in pyDatalog.ask('Item(Item, Quantity, _, ReorderPoint)').answers:
        if item[1] <= item[3]:
            items_to_reorder.append(item[0])
    return items_to_reorder

# Sample sales and restocking
Sale('apple', 10)
Restock('orange', 20)

# Print total inventory value
print(pyDatalog.ask('total_inventory_value(TotalValue)'))

# Print items that need to be reordered
print("Items to reorder: ", check_reorder_point())

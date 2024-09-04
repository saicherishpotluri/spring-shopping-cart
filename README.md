# spring-shopping-cart

## 1. Entity Creation
  * Create a package called 'model', in that create three classes Product, Category, Image. Write down the necessary variables.
## 2. Setup Relationships
  * Image has ManyToOne relation with Products
  * Product has OneToMany relation with Images and ManyToOne relation with Category
  * Category has OneToMany relation with Products

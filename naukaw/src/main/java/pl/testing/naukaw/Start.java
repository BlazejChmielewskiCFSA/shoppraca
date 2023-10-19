package pl.testing.naukaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import pl.testing.naukaw.repo.*;
import pl.testing.naukaw.entity.*;

import javax.annotation.PostConstruct;

@Component
public class Start {

    private AddressRepo addressRepo;
    private BrandRepo brandRepo;
    private CartRepo cartRepo;
    private CategoryRepo categoryRepo;
    private CountryRepo countryRepo;
    private OrderDetailsRepo orderDetailsRepo;
    private OrderRepo orderRepo;
    private ProductRepo productRepo;
    private ReviewRepo reviewRepo;
    private RoleRepo roleRepo;
    private StatusRepo statusRepo;
    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public Start(AddressRepo addressRepo, BrandRepo brandRepo, CartRepo cartRepo, CategoryRepo categoryRepo, CountryRepo countryRepo, OrderDetailsRepo orderDetailsRepo, OrderRepo orderRepo, ProductRepo productRepo, ReviewRepo reviewRepo, RoleRepo roleRepo, StatusRepo statusRepo, UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.addressRepo = addressRepo;
        this.brandRepo = brandRepo;
        this.cartRepo = cartRepo;
        this.categoryRepo = categoryRepo;
        this.countryRepo = countryRepo;
        this.orderDetailsRepo = orderDetailsRepo;
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
        this.reviewRepo = reviewRepo;
        this.roleRepo = roleRepo;
        this.statusRepo = statusRepo;
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void start(){

//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = now.format(formatter);
//
//        //Tables witch is enums or don't have foreign key
//        Category category = new Category("moda");
//        Category category1 = new Category("sport");
//        List<Category> categoryList = List.of(category,category1);
//        categoryRepo.save(category);
//        categoryRepo.save(category1);
//
//        Role role = new Role("admin");
//        roleRepo.save(role);
//
//        Status status = new Status("New");
//        statusRepo.save(status);
//
//        Address address = new Address("janapawla", 12);
//        addressRepo.save(address);
//
//        Country country = new Country("German");
//        countryRepo.save(country);
//
//        Brand brand = new Brand("adidas", "n94923942");
//        brandRepo.save(brand);
//
//        Cart cart = new Cart("essunia");
//        Cart cart1 = new Cart("essuniaez");
//        List<Cart> cartList = List.of(cart1,cart);
//
//        Order order = new Order(formattedDateTime);
//
//        //////////
//
        //User
        User user = new User("aaa", passwordEncoder.encode("bbb"));
        User user1 = new User("Kamil", passwordEncoder.encode("Mostowsky"));

        userRepo.save(user);
        userRepo.save(user1);
//
//        // Product
//        Product product = new Product("nawilżacz", "Nawilza powietrze", new BigDecimal(149.99), 2);
//        Product product1 = new Product("fajnykubek", "bez wkladu", new BigDecimal(179.99), 2);
//        product.setBrand(brand);
//        product1.setBrand(brand);
//        List<Product> productList = List.of(product);
//        List<Product> productList1 = List.of(product,product1);
//
//        //Pierwszy Cross do powiązanych z produktem
//        category.setProducts(productList);
//        category1.setProducts(productList);
//
//        cart.setProducts(productList);
//        cart1.setProducts(productList1);
//        cart.setUser(user);
//        cart1.setUser(user1);
//
//        //Drugi Cross do productów
//        product.setCategories(categoryList);
//        product.setCarts(cartList);
//        product1.setCategories(categoryList);
//        product1.setCarts(cartList);
//
//        order.setStatus(status);
//        order.setCart(cart);
//        order.setAddress(address);
//
//        //saves
//        productRepo.save(product);
//        productRepo.save(product1);
//        cartRepo.save(cart);
//        cartRepo.save(cart1);
//        orderRepo.save(order);
//
//        //Review
//        Review review = new Review(1.23,"essunia product");
//        review.setUser(user);
//        review.setProduct(product);
//        reviewRepo.save(review);



    }
}

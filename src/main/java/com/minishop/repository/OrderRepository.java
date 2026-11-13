package com.minishop.repository;

import com.minishop.model.ShopOrder;
import com.minishop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<ShopOrder, Long> {
    List<ShopOrder> findByUserOrderByCreatedAtDesc(User user);
    List<ShopOrder> findAllByOrderByCreatedAtDesc();
}

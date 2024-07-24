package com.devlearn.vlu.server.repository;

import com.devlearn.vlu.server.entity.Order;
import com.devlearn.vlu.server.enums.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tippy091
 * @created 24/07/2024
 * @project Server
 **/

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByUserIdAndOrderStatus(Long userId, OrderStatus orderStatus);

}

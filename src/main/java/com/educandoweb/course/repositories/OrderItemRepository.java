package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;

// É opcional a notação, pelo fato dessa interface, estender a interface JPARepository,
// no qual, já é registrada como componente do Spring
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

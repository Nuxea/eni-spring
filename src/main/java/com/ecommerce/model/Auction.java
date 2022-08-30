package com.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "auctions")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @Column(name = "auction_type_id", nullable = false)
    private Long auctionTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auction_type_id", referencedColumnName = "id", insertable = false, updatable = false)
    private AuctionType auctionType;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;
}

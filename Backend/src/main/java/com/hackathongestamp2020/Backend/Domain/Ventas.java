package com.hackathongestamp2020.Backend.Domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Document(collection = "ventas")
public class Ventas {

    @Id
    public String id;

    @Field("Region")
    public String region;

    @Field("Country")
    public String country;

    @Field("Item Type")
    public String item_type;

    @Field("Sales Channel")
    public String sales_channel;

    @Field("Order Priority")
    public String order_priority;

    @DateTimeFormat
    @Field("Order Date")
    public String order_date;

    @Field("Order ID")
    public String order_id;

    @Field("Ship Date")
    public String ship_date;

    @NumberFormat
    @Field("Units Sold")
    public String units_sold;

    @NumberFormat
    @Field("Unit Price")
    public String unit_price;

    @NumberFormat
    @Field("Unit Cost")
    public String unit_cost;

    @NumberFormat
    @Field("Total Revenue")
    public String total_revenue;

    @NumberFormat
    @Field("Total Cost")
    public String total_cost;

    @NumberFormat
    @Field("Total Profit")
    public String total_profit;

}

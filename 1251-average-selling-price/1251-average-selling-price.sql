select Prices.product_id, round(sum(UnitsSold.units*Prices.price)/ sum(UnitsSold.units), 2) as average_price from Prices left join UnitsSold on Prices.product_id = UnitsSold.product_id and UnitsSold.purchase_date between Prices.start_date and Prices.end_date
group by Prices.product_id
order by Prices.product_id asc;
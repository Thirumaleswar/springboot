package com.vbw.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.vbw.bo.BikeBo;


public class BikesDao {
	private final String SQL_SELECT_BIKES="SELECT bike_no,bike_model_no,manufacturer,rta_registration_no,price FROM bike order by bike_model_no";
private JdbcTemplate jdbcTemplate;

public BikesDao(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public List<BikeBo> getBikes(){
	List<BikeBo> bikeBo=null;
	bikeBo=jdbcTemplate.query(SQL_SELECT_BIKES, new BikeRowMapper());
	return bikeBo;
}
}
final class BikeRowMapper implements RowMapper<BikeBo>{

	@Override
	public BikeBo mapRow(ResultSet rs, int rowNum) throws SQLException {
    BikeBo bikeBo=new BikeBo();
    bikeBo.setBikeNo(rs.getInt(1));
    bikeBo.setBikeModelNo(rs.getString(2));
    bikeBo.setManufacturer(rs.getString(3));
    bikeBo.setRtaRegistrationNo(rs.getString(4));
    bikeBo.setPrice(rs.getDouble(5));
		return bikeBo;
	}
	
}

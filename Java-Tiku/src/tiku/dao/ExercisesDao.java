package tiku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.support.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import tiku.domain.Exercises;

public class ExercisesDao {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
//	
//	public void insert(Exercises exercises) {
//		String sql = "INSERT INTO exercises(e_desc, e_answer, e_diff, e_type, e_point, e_img, e_tag)" + 
//				"VALUES (:e_desc, :e_answer, :e_diff, :e_type, :e_point, :e_img, :e_tag)";
//		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(exercises);
//		getJdbcTemplate().update(sql, parameterSource);
//	}
//	
//	public void update(Exercises exercises) {
//		String sql = "UPDATE exercises SET e_desc=:e_desc, e_answer=:e_answer, e_diff=:e_diff, e_type=:e_type, e_point=:e_point, e_img=:e_img, e_tag=:e_tag";
//		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(exercises);
//		getJdbcTemplate().update(sql, parameterSource);
//	}
//	
	public List<Exercises> findAll() {
		String sql = "SELECT * FROM exercises";
		//RowMapper<Exercises> rm = BeanPropertyRowMapper.newInstance(Exercises.class);
		//List<Exercises> exercisesList = getJdbcTemplate().query(sql, rm);
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			List<Exercises> exercisesList = new ArrayList<Exercises>();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Exercises mye = new Exercises(rs.getString("e_desc"), rs.getString("e_answer"), rs.getString("e_diff"), rs.getString("e_type"), 
						rs.getString("e_point"), rs.getString("e_img"), rs.getString("e_tag"));
				exercisesList.add(mye);
			}
			return exercisesList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
		}
		//return exercisesList;
	}
	//根据难度，类型，和知识点来查找
//	
//	public List<Exercises> findByDTP(Exercises exercises) {
//		String sql = "SELECT * FROM exercises WHERE e_diff=:e, e_type=:e_type, e_point=:e_point";
//		RowMapper<Exercises> rm = BeanPropertyRowMapper.newInstance(Exercises.class);
//		List<Exercises> exercisesList = getJdbcTemplate()
//				.query(sql, new Object[] {exercises.getEdiff(), exercises.getEtype(), exercises.getEpoint()}, rm);
//		return exercisesList;
//	}
//	
//	public void delete(Exercises exercises) {
//		String sql = "DELETE exercises WHERE e_desc=:e_desc AND e_answer=:e_answer";
//		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(exercises);
//		getJdbcTemplate().update(sql, parameterSource);
//	}
}

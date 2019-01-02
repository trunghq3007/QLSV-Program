package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.TrainingType;
import utils.Constants;
import utils.DbConnection;

public class TrainingTypeDAL implements BaseDAL<TrainingType> {
	@Override
	public List<TrainingType> getAll() throws SQLException {
		List<TrainingType> list = new ArrayList<TrainingType>();
		Connection conn = DbConnection.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(Constants.TrainningType.SELECT_ALL);

		while (result.next()) {
			TrainingType training = new TrainingType();
			training.setTrainingTypeId(result.getString(Constants.TrainningType.TRAINING_TYPE_ID));
			training.setTrainingTypeName(
					result.getString(Constants.TrainningType.TRAINING_TYPE_NAME));
			list.add(training);
		}

		result.close();
		stmt.close();
		DbConnection.releaseConnection(conn);
		return list;
	}

	@Override
	public TrainingType getByCode(String code) throws SQLException {
		TrainingType training = new TrainingType();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.TrainningType.SELECT_ONE);
		statement.setString(1, code);
		ResultSet result = statement.executeQuery();
		while (result.next()) {

			training.setTrainingTypeId(result.getString(Constants.TrainningType.TRAINING_TYPE_ID));
			training.setTrainingTypeName(
					result.getString(Constants.TrainningType.TRAINING_TYPE_NAME));
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return training;
	}

	@Override
	public int insert(TrainingType object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.TrainningType.INSERT);
		statement.setString(1, object.getTrainingTypeId());
		statement.setString(2, object.getTrainingTypeName());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int update(TrainingType object) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.TrainningType.UPDATE);
		statement.setString(2, object.getTrainingTypeId());
		statement.setString(1, object.getTrainingTypeName());
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public int delete(String code) throws SQLException {
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.TrainningType.DELETE);
		statement.setString(1, code);
		int result = statement.executeUpdate();
		statement.close();
		DbConnection.releaseConnection(conn);
		return result;
	}

	@Override
	public List<TrainingType> fillter(String sequenceFilter) throws SQLException {
		List<TrainingType> list = new ArrayList<TrainingType>();
		Connection conn = DbConnection.getConnection();
		PreparedStatement statement = conn.prepareStatement(Constants.TrainningType.FILTER);
		sequenceFilter = "%" + sequenceFilter + "%";
		statement.setString(1, sequenceFilter);
		statement.setString(2, sequenceFilter);
		ResultSet result = statement.executeQuery();
		while (result.next()) {
			TrainingType training = new TrainingType();
			training.setTrainingTypeId(result.getString(Constants.TrainningType.TRAINING_TYPE_ID));
			training.setTrainingTypeName(
					result.getString(Constants.TrainningType.TRAINING_TYPE_NAME));
			list.add(training);
		}

		result.close();
		statement.close();
		DbConnection.releaseConnection(conn);
		return list;
	}
}

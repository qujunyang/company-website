package orm;

import org.apache.ibatis.session.SqlSession;

public class sqltest {
	public int id;
	public String mingcheng;
	public String jianjie;
	public String sqlmingcheng(String mingcheng) {
		SqlSession sql = util.getSession();
		//tupian tupian = sql.selectOne("orm.mapper.Bymingcheng", mingcheng);
		tupian tupian = sql.selectOne("orm.mapper.Bymingcheng", mingcheng);
		String b = tupian.getjianjie();
		sql.close();
		return b;
	}
	public String sqlgonggao(String biaoti) {
		SqlSession sql = util.getSession();
		String b = sql.selectOne("orm.mapper.gonggao", biaoti);
		sql.close();
		return b;
	}
}

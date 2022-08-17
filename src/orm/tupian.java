package orm;

public class tupian {
	private Integer id;
	private String jianjie;
	private String mingcheng;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getmingcheng() {
		return mingcheng;
	}
	public void setmingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getjianjie() {
		return jianjie;
	}
	public void setjianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	@Override
	public String toString() {
		return "tupian [id=" + id + ", mingcheng=" +mingcheng+ ", jianjie=" + jianjie+"]";
	}
}

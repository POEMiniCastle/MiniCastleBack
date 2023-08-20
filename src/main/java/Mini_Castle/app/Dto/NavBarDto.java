package Mini_Castle.app.Dto;

public class NavBarDto {
	
	private String routeLink;
	private String icon;
	private String label;
	
	public NavBarDto() {}
	
	public NavBarDto(String routeLink, String icon, String label) {
		this.routeLink = routeLink;
		this.icon = icon;
		this.label = label;
	}
	
	public String getRouteLink() {
		return routeLink;
	}
	public void setRouteLink(String routeLink) {
		this.routeLink = routeLink;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	
}

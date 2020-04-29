package patterns;

import java.util.Observable;
import java.util.Observer;

public class Viewer implements Observer {
	private String viewerName;

    public Viewer(String name) {
        this.setViewerName(name);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(this.getViewerName() + "(Viewer) changed exercise to " + o.toString());
    }

    public String getViewerName() {
        return viewerName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }
}

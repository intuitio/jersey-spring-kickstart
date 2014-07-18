package intuitio.kickstart.jersey.api;

import intuitio.kickstart.jersey.domain.Task;
import intuitio.kickstart.jersey.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tasks")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Component
public class TasksResource {
    
    @Autowired
    private TaskService taskService;
    
    @GET
    public List<Task> getAllTasks() {
        return taskService.getAll();
    }
}
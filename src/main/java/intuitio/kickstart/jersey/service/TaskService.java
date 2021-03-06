package intuitio.kickstart.jersey.service;

import intuitio.kickstart.jersey.domain.Task;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TaskService {

    public List<Task> getAll() {
        return Arrays.asList(
                new Task(1L, "Implement jersey spring kickstart"),
                new Task(2L, "Test the implementation")
        );
    }
}
package org.example.springbatchtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class MainController
{
    private final JobLauncher jobLauncher;
    private final JobRegistry jobRegistry;

    @GetMapping("/first")
    public String firstApi(@RequestParam("value")String value) throws Exception
    {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("date",value)
                .toJobParameters();
        jobLauncher.run(jobRegistry.getJob("firstJob"),jobParameters);
        return "ok";
    }

    @GetMapping("/second")
    public String secondApi(@RequestParam("value")String value) throws Exception
    {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("date",value)
                .toJobParameters();
        jobLauncher.run(jobRegistry.getJob("secondJob"),jobParameters);
        return "ok";
    }
    @GetMapping("/fourth")
    public String fourthApi(@RequestParam("value")String value) throws Exception
    {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("date",value)
                .toJobParameters();
        jobLauncher.run(jobRegistry.getJob("fourthJob"),jobParameters);
        return "ok";
    }
    @GetMapping("/fifth")
    public String fifthApi(@RequestParam("value")String value) throws Exception
    {
        JobParameters jobParameters = new JobParametersBuilder()
                .addString("date",value)
                .toJobParameters();
        jobLauncher.run(jobRegistry.getJob("fifthJob"),jobParameters);
        return "ok";
    }
}

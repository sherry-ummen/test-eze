package com.sherry.testeze

import io.camunda.zeebe.client.ZeebeClient
import org.camunda.community.eze.EmbeddedZeebeEngine
import org.camunda.community.eze.RecordStreamSource
import org.camunda.community.eze.ZeebeEngineClock
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@EmbeddedZeebeEngine
class TestEzeApplicationTests {

    lateinit var client: ZeebeClient
    lateinit var recordStream: RecordStreamSource
    lateinit var clock: ZeebeEngineClock

    @Test
    fun contextLoads() {
    }

}

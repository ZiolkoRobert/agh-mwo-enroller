package com.company.enroller.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartingPageController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String mainPage() {
        String simpleInfo =
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title></title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<ol>" +
                        "<br><li><a href=\"https://michalrys-enroller.herokuapp.com/participants\" target=new>GET: /participants</a></li>" +
                        "<br><li><a href=\"https://michalrys-enroller.herokuapp.com/participants/user2\" target=new>GET: /participants/user2</a></li>" +
                        "<br><li><a href=\"https://michalrys-enroller.herokuapp.com/meetings\" target=new>GET: /meetings</a></li>" +
                        "<br><li><a href=\"https://michalrys-enroller.herokuapp.com/meetings/id=2\" target=new>GET: /meetings/id=2</a></li>" +
                        "<br><li><a href=\"https://michalrys-enroller.herokuapp.com/meetings/title=some title\" target=new>GET: /meetings/title=some title</a></li>" +
                        "<br><li><a href=\"https://michalrys-enroller.herokuapp.com/meetings/participantsfrom/meetingid=2\" target=new>GET: /meetings/participantsfrom/meetingid=2</a></li>" +
                        "</ol>" +
                        "</body>\n" +
                        "</html>";

        return simpleInfo;
    }
}

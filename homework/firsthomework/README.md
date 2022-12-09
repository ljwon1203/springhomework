# firstHomework

### API명세

| Method | URL | Request                                                                                           | Response                                                                                                                                                                                           |
|--------|---|---------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| GET    | /api/blogs | -                                                                                                 | {<br>"createdAt": "2022-12-07T15:54:04.69911",<br>"modifiedAt": "2022-12-07T15:54:04.69911",<br>"id": 11,<br>"title": "firstHomework",<br>"username": "sparta",<br>"password": "221031",<br>"contents": "Spring"<br>},{...},{...} |
| POST   | /api/blogs  | {<br>"title": "firstHomework",<br>"username": "sparta",<br>"password": "221031",<br>"contents": "Spring!!!"<br>}         | {<br>"createdAt": "2022-12-07T15:54:04.6991097",<br>"modifiedAt": "2022-12-07T15:54:04.6991097",<br>"id": 11,<br>"title": "firstHomework",<br>"username": "sparta",<br>"password": "221031",<br>"contents": "Spring"<br>} |
| GET    | /api/blogs/{id} | -                                                                                                 | {<br>"createdAt": "2022-12-07T15:37:16.475418",<br>"modifiedAt": "2022-12-07T15:43:28.540347",<br>"id": 8,<br>"title": "hoho",<br>"username": "ljwon2",<br>"password": "1234",<br>"contents": "summer33"<br>} |
| PUT    | /api/blogs/{id} | {<br>"title": "haha!!",<br>"username": "ljwon2",<br>"contents": "winter"<br>} | Long id                                                                                                                                                                                            |
| DELETE | /api/blogs/{id} | {<br>  "password":"password"{<br>}                                                                               | Long id                                                                                                                                                                                            |



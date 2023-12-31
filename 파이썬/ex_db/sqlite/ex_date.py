import datetime

now = datetime.datetime.now()
print('현재 날짜와 시간', now)

#format
format_now = now.strftime("%Y-%m-%d %H:%M:%S") #풀년도
print('현재 날짜와 시간 년월일시분초', format_now)
format_now2 = now.strftime("%y-%m-%d %H:%M:%S") #뒷자리 년도만 원할때
print('현재 날짜와 시간 년월일시분초', format_now2)
print(now.timestamp())
time_now = now.timestamp()
time_now_to_date = datetime.datetime.fromtimestamp(time_now).strftime("%Y-%m-%d")
print(time_now_to_date)

#문자열 to 날짜(문자열을 날짜로 바꾸는방법)
date_str = "2023-07-12 09:10:00"
date_format = "%Y-%m-%d %H:%M:%S"
start_date = datetime.datetime.strptime(date_str,date_format)
print("날짜타입:", start_date)
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.linear_model import LogisticRegression
#스팸 분류기 예시
texts = ["당신에게 특별한 제안이 있습니다.", "회원님 당첨되셨어요","회의 일정을 확인해주세요", "50%할인 쿠폰 드립니다!", "어제 먹은 점심메뉴 말고 다른거 ...","당신의 계좌로 입금되었습니다."]
labels = [1, 1, 0, 1, 0, 0] # 0:정상 1: 스팸

vec =TfidfVectorizer()
x = vec.fit_transform(texts).toarray() #띄어쓰기 기준으로 단어들을 나눠주고 각각에 나눠진 단어들을 숫자로 수치화함
y = labels

model = LogisticRegression()
model.fit(x,y)

#예측
mail = ["쿠폰 드립니다.!"]
mail = vec.transform(mail)
pred = model.predict(mail)
print(pred)
if pred ==0:
    print("정상")
else:
    print("스팸 메세지")
# NAO Robot as an Italian Teaching Assistant

**Autonomous Agents Course Project**  
Technical University of Crete - Winter Semester 2023-2024  
Georgia Bantouva (AM: 2019030006)

## Overview

This project explores the programming capabilities of the NAO robot to serve as an interactive teaching assistant for basic Italian language lessons. Using robotics, speech recognition, and natural language processing technologies, the system creates an engaging learning experience for users.

## Technologies Used

- **Development Environment**: Webots simulation
- **Programming Language**: Python
- **Speech Recognition**: Google Speech Recognition (via `speech_recognition` library)
- **Text-to-Speech**: Pyttsx3 library
- **Language Support**: English and Italian

## Robot Capabilities

### 📚 Teaching Features
- **Vocabulary Lessons**: Teaches Italian vocabulary across categories (family, food, school) with pronunciation
- **Grammar Instruction**: Provides verb conjugation examples and explains definite/indefinite articles
- **Common Conversations**: Offers practical conversational phrases in both English and Italian
- **Italian Culture**: Shares insights into Italian history, customs, traditions, art, and cuisine
- **Interactive Storytelling**: Narrates stories where users choose the continuation path

### ✅ Assessment Tools
- **Quizzes**: Tests understanding of vocabulary, grammar, and conversational phrases with instant feedback
- **Listening Exercises**: Offers three difficulty levels with comprehension questions
- **Pronunciation Practice**: Guides users through difficult words with feedback until correct pronunciation

### 🎤 Interaction Features
- Voice-controlled menu navigation
- Speech recognition for user input
- Error handling with helpful prompts
- Interactive voice-based learning experience

## Challenges & Solutions

### Difficulties Encountered
1. **Movement Integration**: Simulation paused during speech, limiting dynamic gestures
2. **Accent Recognition**: Variations and background noise caused misinterpretations
3. **Language Processing**: Processing delays affected responsiveness

### Potential Improvements
- Combine Choregraphe with Webots for better movement-speech integration
- Implement machine learning for advanced accent recognition
- Optimize algorithms with parallel processing or cloud-based services

## Future Expansions

- **Personalized Learning**: Adaptive technologies that track progress and adjust difficulty
- **Continuous Improvement**: User feedback mechanisms to enhance content and features

## Installation Requirements

All libraries must be installed for successful simulation:
```bash
pip install speech_recognition
pip install pyttsx3
```

## Conclusion

This project demonstrates the potential of robotics in transforming language education through interactive and engaging learning experiences. Despite technical challenges, it establishes a foundation for AI-powered teaching assistants.

---

*For more information, contact: gbantouva@tuc.gr*
